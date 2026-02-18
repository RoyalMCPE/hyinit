package cc.irori.hyinit.shared;

import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class SourceMetaStore {

    private static final Map<Path, SourceMetadata> META_MAP = new ConcurrentHashMap<>();

    // Private constructor to prevent instantiation
    private SourceMetaStore() {}

    public static void put(Path path, SourceMetadata metadata) {
        META_MAP.put(path, metadata);
    }

    public static SourceMetadata get(Path path) {
        return META_MAP.get(path);
    }
}
