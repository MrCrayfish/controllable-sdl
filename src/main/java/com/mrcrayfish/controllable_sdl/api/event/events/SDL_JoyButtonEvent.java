package com.mrcrayfish.controllable_sdl.api.event.events;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.mrcrayfish.controllable_sdl.api.joystick.SDL_JoystickID;
import org.intellij.lang.annotations.MagicConstant;

import static com.mrcrayfish.controllable_sdl.api.event.SDL_EventType.SDL_JOYBUTTONDOWN;
import static com.mrcrayfish.controllable_sdl.api.event.SDL_EventType.SDL_JOYBUTTONUP;
import static com.mrcrayfish.controllable_sdl.api.event.SdlEventsConst.SDL_PRESSED;
import static com.mrcrayfish.controllable_sdl.api.event.SdlEventsConst.SDL_RELEASED;

/**
 * Joystick button event structure (event.jbutton.*)
 */
@Structure.FieldOrder({
        "type",
        "timestamp",
        "which",
        "button",
        "state",
        "padding1",
        "padding2"
})
public final class SDL_JoyButtonEvent extends Structure {

    /**
     * {@link com.mrcrayfish.controllable_sdl.api.event.SDL_EventType#SDL_JOYBUTTONDOWN SDL_JOYBUTTONDOWN}
     * or {@link com.mrcrayfish.controllable_sdl.api.event.SDL_EventType#SDL_JOYBUTTONUP SDL_JOYBUTTONUP}
     */
    @MagicConstant(intValues = {SDL_JOYBUTTONDOWN, SDL_JOYBUTTONUP})
    public int type;

    /** In milliseconds, populated using SDL_GetTicks() */
    public int timestamp;

    /** The joystick instance id */
    public SDL_JoystickID which;

    /** The joystick button index */
    public byte button;

    /**
     * {@link com.mrcrayfish.controllable_sdl.api.event.SdlEventsConst#SDL_PRESSED SDL_PRESSED}
     * or {@link com.mrcrayfish.controllable_sdl.api.event.SdlEventsConst#SDL_RELEASED SDL_RELEASED}
     */
    @MagicConstant(intValues = {SDL_PRESSED, SDL_RELEASED})
    public byte state;

    public byte padding1;
    public byte padding2;

    public SDL_JoyButtonEvent() {
    }

    public SDL_JoyButtonEvent(Pointer p) {
        super(p);
    }
}