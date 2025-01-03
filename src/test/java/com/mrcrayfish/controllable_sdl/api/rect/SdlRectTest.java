package com.mrcrayfish.controllable_sdl.api.rect;

import org.junit.jupiter.api.Test;

import static com.mrcrayfish.controllable_sdl.api.Sdl.SDL_Init;
import static com.mrcrayfish.controllable_sdl.api.Sdl.SDL_Quit;
import static com.mrcrayfish.controllable_sdl.api.rect.SdlRect.SDL_RectEmpty;

public final class SdlRectTest {

    @Test
    public void control() {
        SDL_Init(0);
        SDL_RectEmpty(new SDL_Rect());
        SDL_Quit();
    }
}
