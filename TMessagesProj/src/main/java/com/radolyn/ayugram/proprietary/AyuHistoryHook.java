/*
 * Stub replacement for AyuGram's private "proprietary" submodule
 * (https://github.com/AyuGram/AyuGram4A_proprietary), which this fork
 * cannot fetch in its GitHub Actions build.
 *
 * This keeps the public fork buildable, but intentionally disables the
 * proprietary message-history reconciliation behavior.
 */
package com.radolyn.ayugram.proprietary;

import android.util.Pair;
import android.util.SparseArray;
import org.telegram.messenger.MessageObject;

import java.util.ArrayList;

public class AyuHistoryHook {

    public static Pair<Integer, Integer> getMinAndMaxIds(ArrayList<MessageObject> messArr) {
        return new Pair<>(0, 0);
    }

    public static void doHook(int currentAccount, ArrayList<MessageObject> messArr, SparseArray<MessageObject>[] messagesDict,
                              int startId, int endId, long dialogId, int limit, int topicId, boolean isSecretChat) {
        // Proprietary history hook is unavailable in this fork.
    }
}
