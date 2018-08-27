# Phonograph-Pro

**A material designed local music player for Android.**

![Screenshots](./art/art.jpg?raw=true)

# Pro Version
Under the GPLv3 License, users are allowed to modify and redistribute this software. 

## Download
You can find an apk file of the pro version [here](https://github.com/JavaCafe01/Phonograph-Pro/releases/tag/v0.16.6_Pro).

## Do it yourself
1. Fork the original [Phonograph](https://github.com/kabouzeid/Phonograph) repo
2. Go to `/app/src/main/java/com/kabouzeid/gramophone/App.java`
3. Change the contents of this method: 
```
public static boolean isProVersion() {
    return BuildConfig.DEBUG || 
    app.billingProcessor.isPurchased(PRO_VERSION_PRODUCT_ID);
}
```
&nbsp; &nbsp; &nbsp; &nbsp; To this:
```
public static boolean isProVersion() {
    return true;
}
```
4. An example can be found [here](https://github.com/JavaCafe01/Phonograph-Pro/blob/master/app/src/main/java/com/kabouzeid/gramophone/App.java)
