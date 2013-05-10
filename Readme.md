Debugging
---------

Javascript errors and console output goes to Android
[LogCat](http://developer.android.com/tools/help/logcat.html).

For example you can write this in your Javascript:

    console.log("hi");

You can use Android
[DDMS](http://developer.android.com/tools/debugging/ddms.html) to see
the logs, either from android eclipse ide ADT or from
[monitor](http://developer.android.com/tools/help/monitor.html) tool.

You can filter LogCat in several ways.  For example, if you have two
activities named `org.sugarlabs.clock` and `org.sugarlabs.memorize`,
you can enter in the filter entry:

- `app:clock` - will filter the messages from clock activity
- `app:sugarlabs` - will filter the messages from the two activities
