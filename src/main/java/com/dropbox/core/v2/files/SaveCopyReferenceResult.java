/* DO NOT EDIT */
/* This file was generated from files.babel */

package com.dropbox.core.v2.files;

import com.dropbox.core.json.JsonReadException;
import com.dropbox.core.json.JsonReader;
import com.dropbox.core.json.JsonUtil;
import com.dropbox.core.json.StructJsonDeserializer;
import com.dropbox.core.json.StructJsonSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

@JsonSerialize(using=SaveCopyReferenceResult.Serializer.class)
@JsonDeserialize(using=SaveCopyReferenceResult.Deserializer.class)
public class SaveCopyReferenceResult {
    // struct SaveCopyReferenceResult

    // ProGuard work-around since we declare serializers in annotation
    static final Serializer SERIALIZER = new Serializer();
    static final Deserializer DESERIALIZER = new Deserializer();

    protected final Metadata metadata;

    /**
     *
     * @param metadata  The metadata of the saved file or folder in the user's
     *     Dropbox. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public SaveCopyReferenceResult(Metadata metadata) {
        if (metadata == null) {
            throw new IllegalArgumentException("Required value for 'metadata' is null");
        }
        this.metadata = metadata;
    }

    /**
     * The metadata of the saved file or folder in the user's Dropbox.
     *
     * @return value for this field, never {@code null}.
     */
    public Metadata getMetadata() {
        return metadata;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            metadata
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            SaveCopyReferenceResult other = (SaveCopyReferenceResult) obj;
            return (this.metadata == other.metadata) || (this.metadata.equals(other.metadata));
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return serialize(false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return serialize(true);
    }

    private String serialize(boolean longForm) {
        try {
            return JsonUtil.getMapper(longForm).writeValueAsString(this);
        }
        catch (JsonProcessingException ex) {
            throw new RuntimeException("Failed to serialize object", ex);
        }
    }

    static final class Serializer extends StructJsonSerializer<SaveCopyReferenceResult> {
        private static final long serialVersionUID = 0L;

        public Serializer() {
            super(SaveCopyReferenceResult.class);
        }

        public Serializer(boolean unwrapping) {
            super(SaveCopyReferenceResult.class, unwrapping);
        }

        @Override
        protected JsonSerializer<SaveCopyReferenceResult> asUnwrapping() {
            return new Serializer(true);
        }

        @Override
        protected void serializeFields(SaveCopyReferenceResult value, JsonGenerator g, SerializerProvider provider) throws IOException, JsonProcessingException {
            g.writeObjectField("metadata", value.metadata);
        }
    }

    static final class Deserializer extends StructJsonDeserializer<SaveCopyReferenceResult> {
        private static final long serialVersionUID = 0L;

        public Deserializer() {
            super(SaveCopyReferenceResult.class);
        }

        public Deserializer(boolean unwrapping) {
            super(SaveCopyReferenceResult.class, unwrapping);
        }

        @Override
        protected JsonDeserializer<SaveCopyReferenceResult> asUnwrapping() {
            return new Deserializer(true);
        }

        @Override
        public SaveCopyReferenceResult deserializeFields(JsonParser _p, DeserializationContext _ctx) throws IOException, JsonParseException {

            Metadata metadata = null;

            while (_p.getCurrentToken() == JsonToken.FIELD_NAME) {
                String _field = _p.getCurrentName();
                _p.nextToken();
                if ("metadata".equals(_field)) {
                    metadata = _p.readValueAs(Metadata.class);
                    _p.nextToken();
                }
                else {
                    skipValue(_p);
                }
            }

            if (metadata == null) {
                throw new JsonParseException(_p, "Required field \"metadata\" is missing.");
            }

            return new SaveCopyReferenceResult(metadata);
        }
    }
}
