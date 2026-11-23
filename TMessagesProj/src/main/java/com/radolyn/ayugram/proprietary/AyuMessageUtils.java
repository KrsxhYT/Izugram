/*
 * Stub replacement for AyuGram's private "proprietary" submodule.
 *
 * These methods intentionally do nothing. Message revision/deletion
 * mapping and associated media metadata are therefore unavailable,
 * while keeping the public fork's Java call sites source-compatible.
 */
package com.radolyn.ayugram.proprietary;

import com.radolyn.ayugram.database.entities.DeletedMessage;
import com.radolyn.ayugram.database.entities.EditedMessage;
import com.radolyn.ayugram.messages.AyuSavePreferences;
import org.telegram.tgnet.TLRPC;

public class AyuMessageUtils {

    public static void map(EditedMessage editedMessage, TLRPC.TL_message msg, int currentAccount) {
        // Proprietary mapping is unavailable in this fork.
    }

    public static void mapMedia(EditedMessage editedMessage, TLRPC.TL_message msg) {
        // Proprietary media mapping is unavailable in this fork.
    }

    public static void map(AyuSavePreferences prefs, EditedMessage revision) {
        // Proprietary mapping is unavailable in this fork.
    }

    public static void mapMedia(AyuSavePreferences prefs, EditedMessage revision, boolean mediaChanged) {
        // Proprietary media mapping is unavailable in this fork.
    }

    public static void map(AyuSavePreferences prefs, DeletedMessage deletedMessage) {
        // Proprietary mapping is unavailable in this fork.
    }

    public static void mapMedia(AyuSavePreferences prefs, DeletedMessage deletedMessage, boolean saveMedia) {
        // Proprietary media mapping is unavailable in this fork.
    }
}
