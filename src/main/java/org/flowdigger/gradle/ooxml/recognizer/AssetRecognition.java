package org.flowdigger.gradle.ooxml.recognizer;

import org.flowdigger.gradle.ooxml.canonical.DiagramAnnotation;
import org.flowdigger.gradle.ooxml.canonical.DiagramEdge;
import org.flowdigger.gradle.ooxml.canonical.DiagramGroup;
import org.flowdigger.gradle.ooxml.canonical.DiagramNode;

import java.util.List;

/**
 * Result of format-specific diagram recognition.
 */
public record AssetRecognition(List<DiagramNode> nodes,
                               List<DiagramEdge> edges,
                               List<DiagramGroup> groups,
                               List<DiagramAnnotation> annotations) {
    public static AssetRecognition empty() {
        return new AssetRecognition(List.of(), List.of(), List.of(), List.of());
    }
}

