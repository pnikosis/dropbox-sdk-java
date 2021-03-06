/* DO NOT EDIT */
/* This file was generated from sharing_folders.babel */

package com.dropbox.core.v2.sharing;

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

/**
 * Whether the user is allowed to take the action on the associated member.
 */
@JsonSerialize(using=MemberPermission.Serializer.class)
@JsonDeserialize(using=MemberPermission.Deserializer.class)
public class MemberPermission {
    // struct MemberPermission

    // ProGuard work-around since we declare serializers in annotation
    static final Serializer SERIALIZER = new Serializer();
    static final Deserializer DESERIALIZER = new Deserializer();

    protected final MemberAction action;
    protected final boolean allow;
    protected final PermissionDeniedReason reason;

    /**
     * Whether the user is allowed to take the action on the associated member.
     *
     * @param action  The action that the user may wish to take on the member.
     *     Must not be {@code null}.
     * @param allow  True if the user is allowed to take the action.
     * @param reason  The reason why the user is denied the permission. Not
     *     present if the action is allowed.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MemberPermission(MemberAction action, boolean allow, PermissionDeniedReason reason) {
        if (action == null) {
            throw new IllegalArgumentException("Required value for 'action' is null");
        }
        this.action = action;
        this.allow = allow;
        this.reason = reason;
    }

    /**
     * Whether the user is allowed to take the action on the associated member.
     *
     * <p> The default values for unset fields will be used. </p>
     *
     * @param action  The action that the user may wish to take on the member.
     *     Must not be {@code null}.
     * @param allow  True if the user is allowed to take the action.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MemberPermission(MemberAction action, boolean allow) {
        this(action, allow, null);
    }

    /**
     * The action that the user may wish to take on the member.
     *
     * @return value for this field, never {@code null}.
     */
    public MemberAction getAction() {
        return action;
    }

    /**
     * True if the user is allowed to take the action.
     *
     * @return value for this field.
     */
    public boolean getAllow() {
        return allow;
    }

    /**
     * The reason why the user is denied the permission. Not present if the
     * action is allowed
     *
     * @return value for this field, or {@code null} if not present.
     */
    public PermissionDeniedReason getReason() {
        return reason;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            action,
            allow,
            reason
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
            MemberPermission other = (MemberPermission) obj;
            return ((this.action == other.action) || (this.action.equals(other.action)))
                && (this.allow == other.allow)
                && ((this.reason == other.reason) || (this.reason != null && this.reason.equals(other.reason)))
                ;
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

    static final class Serializer extends StructJsonSerializer<MemberPermission> {
        private static final long serialVersionUID = 0L;

        public Serializer() {
            super(MemberPermission.class);
        }

        public Serializer(boolean unwrapping) {
            super(MemberPermission.class, unwrapping);
        }

        @Override
        protected JsonSerializer<MemberPermission> asUnwrapping() {
            return new Serializer(true);
        }

        @Override
        protected void serializeFields(MemberPermission value, JsonGenerator g, SerializerProvider provider) throws IOException, JsonProcessingException {
            g.writeObjectField("action", value.action);
            g.writeObjectField("allow", value.allow);
            if (value.reason != null) {
                g.writeObjectField("reason", value.reason);
            }
        }
    }

    static final class Deserializer extends StructJsonDeserializer<MemberPermission> {
        private static final long serialVersionUID = 0L;

        public Deserializer() {
            super(MemberPermission.class);
        }

        public Deserializer(boolean unwrapping) {
            super(MemberPermission.class, unwrapping);
        }

        @Override
        protected JsonDeserializer<MemberPermission> asUnwrapping() {
            return new Deserializer(true);
        }

        @Override
        public MemberPermission deserializeFields(JsonParser _p, DeserializationContext _ctx) throws IOException, JsonParseException {

            MemberAction action = null;
            Boolean allow = null;
            PermissionDeniedReason reason = null;

            while (_p.getCurrentToken() == JsonToken.FIELD_NAME) {
                String _field = _p.getCurrentName();
                _p.nextToken();
                if ("action".equals(_field)) {
                    action = _p.readValueAs(MemberAction.class);
                    _p.nextToken();
                }
                else if ("allow".equals(_field)) {
                    allow = _p.getValueAsBoolean();
                    _p.nextToken();
                }
                else if ("reason".equals(_field)) {
                    reason = _p.readValueAs(PermissionDeniedReason.class);
                    _p.nextToken();
                }
                else {
                    skipValue(_p);
                }
            }

            if (action == null) {
                throw new JsonParseException(_p, "Required field \"action\" is missing.");
            }
            if (allow == null) {
                throw new JsonParseException(_p, "Required field \"allow\" is missing.");
            }

            return new MemberPermission(action, allow, reason);
        }
    }
}
