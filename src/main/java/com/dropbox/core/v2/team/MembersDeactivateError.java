/* DO NOT EDIT */
/* This file was generated from team_members.babel */

package com.dropbox.core.v2.team;

import com.dropbox.core.json.JsonReadException;
import com.dropbox.core.json.JsonReader;
import com.dropbox.core.json.JsonWriter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public enum MembersDeactivateError {
    // union MembersDeactivateError
    /**
     * No matching user found. The provided team_member_id, email, or
     * external_id does not exist on this team.
     */
    USER_NOT_FOUND,
    /**
     * The user is not a member of the team.
     */
    USER_NOT_IN_TEAM,
    /**
     * An unspecified error.
     */
    OTHER; // *catch_all

    private static final java.util.HashMap<String, MembersDeactivateError> VALUES_;
    static {
        VALUES_ = new java.util.HashMap<String, MembersDeactivateError>();
        VALUES_.put("user_not_in_team", USER_NOT_IN_TEAM);
        VALUES_.put("other", OTHER);
    }

    public String toJson(Boolean longForm) {
        return _JSON_WRITER.writeToString(this, longForm);
    }

    public static MembersDeactivateError fromJson(String s) throws JsonReadException {
        return _JSON_READER.readFully(s);
    }

    public static final JsonWriter<MembersDeactivateError> _JSON_WRITER = new JsonWriter<MembersDeactivateError>() {
        public void write(MembersDeactivateError x, JsonGenerator g) throws IOException {
            switch (x) {
                case USER_NOT_FOUND:
                    g.writeStartObject();
                    g.writeFieldName(".tag");
                    g.writeString("user_not_found");
                    g.writeEndObject();
                    break;
                case USER_NOT_IN_TEAM:
                    g.writeStartObject();
                    g.writeFieldName(".tag");
                    g.writeString("user_not_in_team");
                    g.writeEndObject();
                    break;
                case OTHER:
                    g.writeStartObject();
                    g.writeFieldName(".tag");
                    g.writeString("other");
                    g.writeEndObject();
                    break;
            }
        }
    };

    public static final JsonReader<MembersDeactivateError> _JSON_READER = new JsonReader<MembersDeactivateError>() {
        public final MembersDeactivateError read(JsonParser parser) throws IOException, JsonReadException {
            return JsonReader.readEnum(parser, VALUES_, OTHER);
        }
    };
}