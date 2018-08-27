package shubham.kajaria.gramophone.glide;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.module.GlideModule;
import shubham.kajaria.gramophone.glide.artistimage.ArtistImage;
import shubham.kajaria.gramophone.glide.artistimage.ArtistImageLoader;
import shubham.kajaria.gramophone.glide.audiocover.AudioFileCover;
import shubham.kajaria.gramophone.glide.audiocover.AudioFileCoverLoader;

import java.io.InputStream;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public class PhonographGlideModule implements GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {

    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        glide.register(AudioFileCover.class, InputStream.class, new AudioFileCoverLoader.Factory());
        glide.register(ArtistImage.class, InputStream.class, new ArtistImageLoader.Factory(context));
    }
}
