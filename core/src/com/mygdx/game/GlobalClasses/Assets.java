//https://github.com/tuskeb/mester
package com.mygdx.game.GlobalClasses;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
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
import com.mygdx.game.DemoMenu.MenuScreen;


public class Assets {

	// https://github.com/libgdx/libgdx/wiki/Managing-your-assets
	// http://www.jacobplaster.net/using-libgdx-asset-manager
	// https://www.youtube.com/watch?v=JXThbQir2gU
	// https://github.com/Matsemann/libgdx-loading-screen/blob/master/Main/src/com/matsemann/libgdxloadingscreen/screen/LoadingScreen.java

	public static AssetManager manager;
	public static final String CHARS = "0123456789öüóqwertzuiopőúasdfghjkléáűíyxcvbnm'+!%/=()ÖÜÓQWERTZUIOPŐÚASDFGHJKLÉÁŰÍYXCVBNM?:_*<>#&@{}[],-.";



	static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
	static {
		fontParameter.fontFileName = "c64.ttf";
		fontParameter.fontParameters.size = 30;
		fontParameter.fontParameters.characters = CHARS;
		fontParameter.fontParameters.color = Color.WHITE;
	}
	public static final AssetDescriptor<BitmapFont> FONT_C64_30
			= new AssetDescriptor<BitmapFont>(fontParameter.fontFileName, BitmapFont.class, fontParameter);

	public static final AssetDescriptor<TextureAtlas> EXPLOSION_TEXTUREATLAS
			= new AssetDescriptor<TextureAtlas>("explosion.atlas", TextureAtlas.class);
	public static final AssetDescriptor<TextureAtlas> MONEY_TEXTUREATLAS
			= new AssetDescriptor<TextureAtlas>("mozgopenz.atlas", TextureAtlas.class);

	public static final AssetDescriptor<Texture> CURSOR_TEXTURE
			= new AssetDescriptor<Texture>("images/cursor.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXTBOX_TEXTURE
			= new AssetDescriptor<Texture>("images/textbox.png", Texture.class);
	public static final AssetDescriptor<Texture> BACKGROUND_TEXTURE
			= new AssetDescriptor<Texture>("background2.png", Texture.class);
	public static final AssetDescriptor<Texture> CAR_TEXTURE_1
			= new AssetDescriptor<Texture>("car-1.png", Texture.class);
	public static final AssetDescriptor<Texture> CAR_TEXTURE_2
			= new AssetDescriptor<Texture>("car-2.png", Texture.class);
	public static final AssetDescriptor<Texture> CAR_TEXTURE_3
			= new AssetDescriptor<Texture>("car-3.png", Texture.class);
	public static final AssetDescriptor<Texture> CAR_TEXTURE_4
			= new AssetDescriptor<Texture>("car-4.png", Texture.class);
	public static final AssetDescriptor<Texture> MONEY_TEXTURE
			= new AssetDescriptor<Texture>("money.png", Texture.class);
	public static final AssetDescriptor<Texture> MUTE_ICON
			= new AssetDescriptor<Texture>("mute.png", Texture.class);
	public static final AssetDescriptor<Texture> SOUND_ICON
			= new AssetDescriptor<Texture>("sound.png", Texture.class);
	public static final AssetDescriptor<Texture> CITY_ACTION_BACKGROUND
			= new AssetDescriptor<Texture>("city.png", Texture.class);
	public static final AssetDescriptor<Texture> GAZ_ICON
			= new AssetDescriptor<Texture>("gaz.png", Texture.class);
	public static final AssetDescriptor<Texture> FEK_ICON
			= new AssetDescriptor<Texture>("fek.png", Texture.class);
	public static final AssetDescriptor<Texture> CONF_ICON
			= new AssetDescriptor<Texture>("cog.png", Texture.class);
	public static final AssetDescriptor<Texture> ROAD_BLOCK
			= new AssetDescriptor<Texture>("ut.png", Texture.class);
	public static final AssetDescriptor<Texture> ROAD_MENU
			= new AssetDescriptor<Texture>("felulet.png", Texture.class);
	public static final AssetDescriptor<Texture> HEART
			= new AssetDescriptor<Texture>("heart.png", Texture.class);
	public static final AssetDescriptor<Texture> NOHEART
			= new AssetDescriptor<Texture>("noheart.png", Texture.class);
	public static final AssetDescriptor<Texture> PLUS_VOL
			= new AssetDescriptor<Texture>("vol/plusz.png", Texture.class);
	public static final AssetDescriptor<Texture> MINUS_VOL
			= new AssetDescriptor<Texture>("vol/minusz.png", Texture.class);
	public static final AssetDescriptor<Texture> FILLED_VOL
			= new AssetDescriptor<Texture>("vol/teli.png", Texture.class);
	public static final AssetDescriptor<Texture> EMPTY_VOL
			= new AssetDescriptor<Texture>("vol/ures.png", Texture.class);
	public static final AssetDescriptor<Texture> BLOCAKDE_0
			= new AssetDescriptor<Texture>("blockade-0.png", Texture.class);
	public static final AssetDescriptor<Texture> BLOCAKDE_1
			= new AssetDescriptor<Texture>("blockade-1.png", Texture.class);
	public static final AssetDescriptor<Texture> ARROW
			= new AssetDescriptor<Texture>("nyil.png", Texture.class);
	public static final AssetDescriptor<Texture> BREAK
			= new AssetDescriptor<Texture>("break.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_1_1
			= new AssetDescriptor<Texture>("text-1-1.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_1_2
			= new AssetDescriptor<Texture>("text-1-2.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_1_3
			= new AssetDescriptor<Texture>("text-1-3.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_2_1
			= new AssetDescriptor<Texture>("text-2-1.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_2_2
			= new AssetDescriptor<Texture>("text-2-2.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_2_3
			= new AssetDescriptor<Texture>("text-2-3.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_3_1
			= new AssetDescriptor<Texture>("text-3-1.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_3_2
			= new AssetDescriptor<Texture>("text-3-2.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_3_3
			= new AssetDescriptor<Texture>("text-3-3.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_4_1
			= new AssetDescriptor<Texture>("text-4-1.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_4_2
			= new AssetDescriptor<Texture>("text-4-2.png", Texture.class);
	public static final AssetDescriptor<Texture> TEXT_4_3
			= new AssetDescriptor<Texture>("text-4-3.png", Texture.class);

	//zenék
	public static final AssetDescriptor<Music> EXTREMEACTION
			= new AssetDescriptor<Music>("music/bensound-extremeaction.mp3", Music.class);
	public static final AssetDescriptor<Music> HAPPYROCK
			= new AssetDescriptor<Music>("music/bensound-happyrock.mp3", Music.class);
	public static final AssetDescriptor<Music> MOOSE
			= new AssetDescriptor<Music>("music/bensound-moose.mp3", Music.class);
	public static final AssetDescriptor<Music> POPDANCE
			= new AssetDescriptor<Music>("music/bensound-popdance.mp3", Music.class);
	public static final AssetDescriptor<Music> DANCE
			= new AssetDescriptor<Music>("music/bensound-dance.mp3", Music.class);
	public static final AssetDescriptor<Music> BADASS
			= new AssetDescriptor<Music>("music/bensound-badass.mp3", Music.class);

	public static void prepare() {
		manager = new AssetManager();
		Texture.setAssetManager(manager);
	}

	public static void load() {
		FileHandleResolver resolver = new InternalFileHandleResolver();
		manager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
		manager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));
		manager.setLoader(BitmapFont.class, ".otf", new FreetypeFontLoader(resolver));

		manager.load(FONT_C64_30);
		manager.load(TEXTBOX_TEXTURE);
		manager.load(CURSOR_TEXTURE);
		manager.load(EXTREMEACTION);
		manager.load(HAPPYROCK);
		manager.load(MOOSE);
		manager.load(POPDANCE);
		manager.load(BADASS);
		manager.load(DANCE);
		manager.load(BACKGROUND_TEXTURE);
		manager.load(MONEY_TEXTURE);
		manager.load(MUTE_ICON);
		manager.load(SOUND_ICON);
		manager.load(CITY_ACTION_BACKGROUND);
		manager.load(GAZ_ICON);
		manager.load(FEK_ICON);
		manager.load(CONF_ICON);
		manager.load(PLUS_VOL);
		manager.load(MINUS_VOL);
		manager.load(FILLED_VOL);
		manager.load(EMPTY_VOL);
		manager.load(ROAD_BLOCK);
		manager.load(ROAD_MENU);
		manager.load(HEART);
		manager.load(NOHEART);
		manager.load(BLOCAKDE_0);
		manager.load(BLOCAKDE_1);
		manager.load(ARROW);
		manager.load(EXPLOSION_TEXTUREATLAS);
		manager.load(MONEY_TEXTUREATLAS);
		manager.load(BREAK);
		manager.load(CAR_TEXTURE_1);
		manager.load(CAR_TEXTURE_2);
		manager.load(CAR_TEXTURE_3);
		manager.load(CAR_TEXTURE_4);
		manager.load(TEXT_1_1);
		manager.load(TEXT_1_2);
		manager.load(TEXT_1_3);
		manager.load(TEXT_2_1);
		manager.load(TEXT_2_2);
		manager.load(TEXT_2_3);
		manager.load(TEXT_3_1);
		manager.load(TEXT_3_2);
		manager.load(TEXT_3_3);
		manager.load(TEXT_4_1);
		manager.load(TEXT_4_2);
		manager.load(TEXT_4_3);
	}

    public static void afterLoaded() {
        //manager.get(MUSIC).setLooping(true);
    }

	public static void unload() {
		manager.dispose();
	}

}
