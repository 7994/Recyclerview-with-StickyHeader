package com.example.mashuk.stickyheaderrecyclerview;

import com.brandongogetap.stickyheaders.exposed.StickyHeader;

/**
 * Created by mashuk on 31/1/18.
 */

public class HeaderItem extends Item implements StickyHeader {
    HeaderItem(String title, String message) {
        super(title, message);
    }
}