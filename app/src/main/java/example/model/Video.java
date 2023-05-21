package example.model;


import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Style(
    of = "new", // renames "of" method to "new", which is interpreted as plain constructor
    allParameters = true // unrelated to the line above: every attribute becomes parameter
    // reminder: don't get used to inline styles, read style guide!
)
@Value.Immutable
public interface Video {
    String name();

    int width();

    int height();

    List<Link> links();

    Optional<VideoCodec> videoCodec();

}
