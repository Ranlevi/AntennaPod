package de.danoeh.antennapod_mh.core.gpoddernet;

class GpodnetServiceBadStatusCodeException extends GpodnetServiceException {
    private final int statusCode;

    public GpodnetServiceBadStatusCodeException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }


}
