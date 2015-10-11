package com.style.me.hd.global.filter.adjuster;

import com.style.me.hd.global.helper.AdjusterHelper;

import jp.co.cyberagent.android.gpuimage.GPUImagePosterizeFilter;

/**
 * Created by Kosh on 10/11/2015. copyrights are reserved
 */
public class PosterizeAdjuster extends AdjusterHelper<GPUImagePosterizeFilter> {
    @Override
    public void adjust(final int percentage) {
        // In theorie to 256, but only first 50 are interesting
        getFilter().setColorLevels(range(percentage, 1, 50));
    }
}
