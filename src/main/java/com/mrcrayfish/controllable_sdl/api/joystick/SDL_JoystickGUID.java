package com.mrcrayfish.controllable_sdl.api.joystick;

import com.sun.jna.Pointer;
import com.mrcrayfish.controllable_sdl.api.guid.SDL_GUID;

/**
 * A structure that encodes the stable unique id for a joystick device
 */
public final class SDL_JoystickGUID extends SDL_GUID {

    public SDL_JoystickGUID() {
    }

    public SDL_JoystickGUID(Pointer p) {
        super(p);
    }
}
