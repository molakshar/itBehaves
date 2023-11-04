package org.molakshar.java.codingchallenge;

/*
  There are n blacklisted IP regexes given as an array of strings, blacklisted_ips, where each string consists of a
  string of numeric characters, ∵ or a '*' where '*' represents a wildcard character that can be
  replaced with 0 or more characters.
  For example, the regex IP"⋆.123.∗" matches with "12.1.123.45", "1.123.435.12", but not with "1.2.3.4".
 
  There are qIP requests to be processed given an array of IP addresses, requests where requests[i]
  arrives in the ith  second. A request is blocked if it matches any of the blacklisted regex IPs,
  or the IP address has sent at least 2 requests in the last 5 seconds which have not been blocked.
 
   Given requests and blacklisted_ips, for each request, report 1 if it will be blocked and 0 otherwise.
 
  Note: All IPs are characterised by a string of four integers separated by three dots - ". ..".
  Example  Suppose n=3, blacklisted ips=["⋆111.∗′′,"123.⋆′′,"34.∗′′],
  q=7, 
  requests =["123.1.23.34","121.1.23.34","121.1.23.34", "34.1.23.34",  
  "121.1.23.34", "12.1.23.34", "121.1.23.34"] 
 
  Hence the answer is [1,0,0,1,1,0,0].
  Note : At time 7 the request IP "121.1.23.34" is not blocked because in the last 5 seconds,
  only the instance which came at time 3 is accepted.
  The request which came at time 5 was blocked, so it is not included in the current count.
 
 
  Function Description Complete the function validateRequests in the editor below.
  validateRequests has the following parameter(s):
  string blacklisted_ips[n]: the blacklisted IP regexes string requests [q]:
  the IPs of incoming requests Returns: int [q]:
  if a request is blocked report 1 and 0 otherwise
  Constraints - 1≤n≤10 - 1≤∣ blacklisted_ips[i] ∣≤15 - 1≤q≤1000 - 1≤∣ requests[i] ∣≤15
  Sample Input For Custom Testing Sample Output 0 0 1 0
  Explanation The third request is blocked since it matches with "111.* .255′′→ "111.3.5.255".
  All the other requests can be processed.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;

public class IPAddressBlackListing {
    public static void main(String[] args) {
        List<Pattern> patterns = new ArrayList<>();
        patterns.add(Pattern.compile("123.*", Pattern.CASE_INSENSITIVE));
        patterns.add(Pattern.compile("34.*"));
        patterns.add(Pattern.compile("\\*.111.*", Pattern.CASE_INSENSITIVE));
        String requests[]={"123.1.23.34",
                "121.1.23.34","121.1.23.34","34.1.23.34",
                "121.1.23.34","12.1.23.34","121.1.23.34"} ;
        Deque<String> processed = new ArrayDeque<>(5);
        int count = 0;
        boolean matchFound = false;
        for (String request : requests) {
            count++;
            // reset count if 5
            if (count >= 5) {
                // remove from queue first item
                if (!processed.isEmpty()) {
                    processed.removeFirst();
                }
            }
            for (Pattern pattern : patterns) {
                Matcher matcher = pattern.matcher(request);
                matchFound = matcher.matches();
                if (matchFound) {
                    processed.addLast("NA");
                    System.out.print(1);
                    break;
                }
            }
            if (!matchFound) {
                if (!processed.contains(request)) {
                    processed.addLast(request);
                    System.out.print(0);
                } else {
                    int requested = 0;
                    processed.addLast(request);
                    // count the requests
                    for (String allowed : processed) {
                        if (allowed.equals(request)) {
                            requested++;
                        }
                    }
                    if (requested > 2) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                    requested = 0;
                }
            }
            matchFound = false; // reset matchFound
        }
    }
}
