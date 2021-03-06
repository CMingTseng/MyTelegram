/*
 * This is the source code of Telegram for Android v. 3.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2017.
 */

package org.telegram.ui.Components;

import android.text.style.URLSpan;

/**
 * URL跨度替换
 */
public class URLSpanReplacement extends URLSpan {

    public URLSpanReplacement(String url) {
        super(url);
    }
}
