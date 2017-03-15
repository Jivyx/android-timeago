#Android timeago library

This is an Android port of the [jquery-timeago](https://github.com/rmm5t/jquery-timeago) plug-in.  Please visit the [jquery-timeago](http://rmm5t.github.com/jquery-timeago/) project page to read more about fuzzy timestamps.


##Usage

```java
long current = System.currentTimeMillis();
String minutes = TimeAgo.timeAgo(current - (15 * 60 * 1000));	// returns "15 minutes ago"
String hours = TimeAgo.timeUntil(current - (6 * 60 * 60 * 1000));	// returns "6 hours from now"
```


##Contribution

If you would like to contribute locale-specific properties files please fork this repository and open a pull request.

##Other

[MIT License](http://www.opensource.org/licenses/mit-license.html)