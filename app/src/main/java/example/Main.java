package example;

import example.model.ImmutableLink;
import example.model.ImmutableVideo;
import example.model.VideoCodec;
import io.avaje.jsonb.Jsonb;

import java.net.URI;

public class Main {

    private static final Jsonb JSONB;

    static {
        JSONB = Jsonb.builder()
            .failOnUnknown(false)
            .serializeEmpty(true)
            .serializeNulls(true)
            .build();
    }

    public static void main(String... args) {
        var video = ImmutableVideo.builder()
            .name("一个视频.mp4")
            .width(800)
            .height(600)
            .addLinks(ImmutableLink.builder().uri(URI.create("http://localhost:3333/link/1")).token("token-123456")
                .build())
            .addLinks(ImmutableLink.builder().uri(URI.create("http://localhost:3333/link/2")).build())
            .videoCodec(VideoCodec.H264)
            .build();

        System.out.println(video);

        var json = JSONB.toJson(video);
        System.out.println("json=" + json);

        var immutableVideo = JSONB.type(ImmutableVideo.class).fromJson(json);
        System.out.println("immutableVideo = " + immutableVideo);

    }

}
