# Java-Convenience-Kit
A small Java utility set that makes Java feel more like Python.

## Why?
Because writing `try { Thread.sleep(...) } catch (...) {}` every time is annoying.
So I wrapped it once, and now I can write:

```java
sleep(1000);
print("Hello");
println("World");
