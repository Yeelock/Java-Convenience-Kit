# Java-Convenience-Kit
A small Java utility set that makes Java feel more like Python.

## Why?
Because writing `try { Thread.sleep(...) } catch (...) {}` every time is annoying.
So I wrapped it once, and now I can write:

```Java
sleep(1000);
print("Hello");
println("World");
```

Features:

1. sleep(ms) without repeating try-catch

2. print() and println() like Python

3. simple input() wrapper with Scanner

Note: I know these ideas already exist somewhere, but I came up with this on my own while learning Java and I'm sharing my approach here
