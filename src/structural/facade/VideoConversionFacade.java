package structural.facade;

import java.io.File;

/**
 * El patrón fachada (facade) consiste en transferir (esconder) la
 * complejidad del código a una clase fachada de modo que pueda
 * ejecutarse el código desde el main de forma sencilla a través
 * de pocas líneas de código.
 */

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionfacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
