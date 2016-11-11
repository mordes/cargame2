//https://github.com/tuskeb/mester
package com.mygdx.game.GlobalClasses;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;


public class Assets {
	//zenék
	//http://www.bensound.com/royalty-free-music/track/pop-dance
	//http://www.bensound.com/royalty-free-music/track/moose
	//http://www.bensound.com/royalty-free-music/track/happy-rock
	//http://www.bensound.com/royalty-free-music/track/extreme-action


	// https://github.com/libgdx/libgdx/wiki/Managing-your-assets
	// http://www.jacobplaster.net/using-libgdx-asset-manager
	// https://www.youtube.com/watch?v=JXThbQir2gU
	// https://github.com/Matsemann/libgdx-loading-screen/blob/master/Main/src/com/matsemann/libgdxloadingscreen/screen/LoadingScreen.java

	public static AssetManager manager;
	public static final String CHARS = "0123456789öüóqwertzuiopőúasdfghjkléáűíyxcvbnm'+!%/=()ÖÜÓQWERTZUIOPŐÚASDFGHJKLÉÁŰÍYXCVBNM?:_*<>#&@{}[],-.";


	static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
	static {
		fontParameter.fontFileName = "c64.ttf";
		fontParameter.fontParameters.size = 50;
		fontParameter.fontParameters.characters = CHARS;
		fontParameter.fontParameters.color = Color.WHITE;
	}
	public static final AssetDescriptor<BitmapFont> FONT_C64
			= new AssetDescriptor<BitmapFont>(fontParameter.fontFileName, BitmapFont.class, fontParameter);


	public static final AssetDescriptor<Texture> CURSOR_TEXTURE
			= new AssetDescriptor<Texture>("images/cursor.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXTBOX_TEXTURE
			= new AssetDescriptor<Texture>("images/textbox.png", Texture.class);
	public static final AssetDescriptor<Texture> BACKGROUND_TEXTURE
			= new AssetDescriptor<Texture>("background.png", Texture.class);
	public static final AssetDescriptor<Texture> CAR_TEXTURE
			= new AssetDescriptor<Texture>("ratyitutu.png", Texture.class);

	//zenék
	public static final AssetDescriptor<Music> EXTREMEACTION
			= new AssetDescriptor<Music>("music/bensound-extremeaction.mp3", Music.class);
	public static final AssetDescriptor<Music> HAPPYROCK
			= new AssetDescriptor<Music>("music/bensound-happyrock.mp3", Music.class);
	public static final AssetDescriptor<Music> MOOSE
			= new AssetDescriptor<Music>("music/bensound-moose.mp3", Music.class);
	public static final AssetDescriptor<Music> POPDANCE
			= new AssetDescriptor<Music>("music/bensound-popdance.mp3", Music.class);


	public static void prepare() {
		manager = new AssetManager();
		Texture.setAssetManager(manager);
	}

	public static void load() {
		FileHandleResolver resolver = new InternalFileHandleResolver();
		manager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
		manager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));
		manager.setLoader(BitmapFont.class, ".otf", new FreetypeFontLoader(resolver));

		manager.load(FONT_C64);
		manager.load(TEXTBOX_TEXTURE);
		manager.load(CURSOR_TEXTURE);
		manager.load(EXTREMEACTION);
		manager.load(HAPPYROCK);
		manager.load(MOOSE);
		manager.load(POPDANCE);
		manager.load(BACKGROUND_TEXTURE);
		manager.load(CAR_TEXTURE);
	}

    public static void afterLoaded() {
        //manager.get(MUSIC).setLooping(true);
    }

	public static void unload() {
		manager.dispose();
	}

}
