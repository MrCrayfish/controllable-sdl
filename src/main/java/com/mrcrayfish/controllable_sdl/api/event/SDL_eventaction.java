package com.mrcrayfish.controllable_sdl.api.event;

import com.mrcrayfish.controllable_sdl.jna.JnaEnum;

public final class SDL_eventaction implements JnaEnum {

    public static final int SDL_ADDEVENT = 0;
    public static final int SDL_PEEKEVENT = 1;
    public static final int SDL_GETEVENT = 2;

    // TODO: Generate public static String toString(int value)

    private SDL_eventaction() {
    }
}