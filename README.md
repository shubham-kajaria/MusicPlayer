# Phonograph-Pro

**A material designed local music player for Android.**



# Pro Version
Under the GPLv3 License, users are allowed to modify and redistribute this software. 

## Download
You can find an apk file [here](https://drive.google.com/open?id=1ZOe9Bw1PsI2H3YmGEcHRu4fzxdpjttv4).

## Do it yourself

1. Go to `/app/src/main/java/com/kabouzeid/gramophone/App.java`
2. Change the contents of this method:
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
```# Music-Player
