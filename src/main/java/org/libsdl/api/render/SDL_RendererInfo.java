package org.libsdl.api.render;

import com.sun.jna.Structure;
import org.intellij.lang.annotations.MagicConstant;
import org.libsdl.api.pixels.SDL_PixelFormatEnum;
import org.libsdl.jna.JnaStructure;

@SuppressWarnings("checkstyle:MagicNumber")
@Structure.FieldOrder({
        "name",
        "flags",
        "numTextureFormats",
        "textureFormats",
        "maxTextureWidth",
        "maxTextureHeight"
})
public final class SDL_RendererInfo extends JnaStructure {

    public String name;

    @MagicConstant(flagsFromClass = SDL_RendererFlags.class)
    public int flags;

    public int numTextureFormats;

    @MagicConstant(valuesFromClass = SDL_PixelFormatEnum.class)
    public int[] textureFormats = new int[16];

    public int maxTextureWidth;

    public int maxTextureHeight;
}