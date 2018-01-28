package org.openpnp.capture;

import org.openpnp.capture.library.OpenpnpCaptureLibrary;

public enum CaptureProperty {
    BackLightCompensation(OpenpnpCaptureLibrary.CAPPROPID_BACKLIGHTCOMP),
    Brightness(OpenpnpCaptureLibrary.CAPPROPID_BRIGHTNESS),
    Contrast(OpenpnpCaptureLibrary.CAPPROPID_CONTRAST),
    Exposure(OpenpnpCaptureLibrary.CAPPROPID_EXPOSURE),
    Focus(OpenpnpCaptureLibrary.CAPPROPID_FOCUS),
    Gain(OpenpnpCaptureLibrary.CAPPROPID_GAIN),
    Gamma(OpenpnpCaptureLibrary.CAPPROPID_GAMMA),
    Hue(OpenpnpCaptureLibrary.CAPPROPID_HUE),
    PowerLineFrequency(OpenpnpCaptureLibrary.CAPPROPID_POWERLINEFREQ),
    Saturation(OpenpnpCaptureLibrary.CAPPROPID_SATURATION),
    Sharpness(OpenpnpCaptureLibrary.CAPPROPID_SHARPNESS),
    WhiteBalance(OpenpnpCaptureLibrary.CAPPROPID_WHITEBALANCE),
    Zoom(OpenpnpCaptureLibrary.CAPPROPID_ZOOM)
    ;
    
    final int propertyId;
    
    private CaptureProperty(int propertyId) {
        this.propertyId = propertyId;
    }
    
    public int getPropertyId() {
        return propertyId;
    }
}
