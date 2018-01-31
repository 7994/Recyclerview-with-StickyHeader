package com.example.mashuk.stickyheaderrecyclerview;

import android.content.Context;

import com.brandongogetap.stickyheaders.StickyLayoutManager;
import com.brandongogetap.stickyheaders.exposed.StickyHeaderHandler;

/**
 * Created by mashuk on 31/1/18.
 */

public class TopSnappedStickyLayoutManager extends StickyLayoutManager {

    TopSnappedStickyLayoutManager(Context context, StickyHeaderHandler headerHandler) {
        super(context, headerHandler);
    }

    @Override
    public void scrollToPosition(int position) {
        super.scrollToPositionWithOffset(position, 0);
    }
}
