package com.brentvatne.exoplayer;

import com.daasuu.mp4compose.filter.GlBilateralFilter;
import com.daasuu.mp4compose.filter.GlBoxBlurFilter;
import com.daasuu.mp4compose.filter.GlBulgeDistortionFilter;
import com.daasuu.mp4compose.filter.GlCGAColorspaceFilter;
import com.daasuu.mp4compose.filter.GlFilter;
import com.daasuu.mp4compose.filter.GlFilterGroup;
import com.daasuu.mp4compose.filter.GlGaussianBlurFilter;
import com.daasuu.mp4compose.filter.GlGrayScaleFilter;
import com.daasuu.mp4compose.filter.GlHazeFilter;
import com.daasuu.mp4compose.filter.GlInvertFilter;
import com.daasuu.mp4compose.filter.GlMonochromeFilter;
import com.daasuu.mp4compose.filter.GlSepiaFilter;
import com.daasuu.mp4compose.filter.GlSharpenFilter;
import com.daasuu.mp4compose.filter.GlSphereRefractionFilter;
import com.daasuu.mp4compose.filter.GlVignetteFilter;
import com.daasuu.mp4compose.filter.GlPosterizeFilter;
import com.daasuu.mp4compose.filter.GlToneFilter; 
import com.daasuu.mp4compose.filter.GlLuminanceThresholdFilter; 
import com.daasuu.mp4compose.filter.GlPixelationFilter; 
import com.daasuu.mp4compose.filter.GlRGBFilter; 
import com.daasuu.mp4compose.filter.GlSolarizeFilter; 
import com.daasuu.mp4compose.filter.GlSwirlFilter; 
import com.daasuu.mp4compose.filter.GlVibranceFilter; 
import com.daasuu.mp4compose.filter.GlZoomBlurFilter; 

public enum FilterTypeMP4 {
    DEFAULT,
    BILATERAL_BLUR,
    BOX_BLUR,
    BULGE_DISTORTION,
    CGA_COLORSPACE,
    GAUSSIAN_FILTER,
    GRAY_SCALE,
    HAZE,
    INVERT,
    MONOCHROME,
    SEPIA,
    SHARP,
    VIGNETTE,
    FILTER_GROUP_SAMPLE,
    SPHERE_REFRACTION,
    POSTERIZE,
    TONE,
    LuminanceThreshold,
    Pixelation,
    RGBFilter,
    Solarize,
    Swirl,
    Vibrance,
    ZoomBlur;
    public static GlFilter createGlFilter(FilterTypeMP4 filterType) {
        switch (filterType) {
            case DEFAULT:
                return new GlFilter();
            case SEPIA:
                return new GlSepiaFilter();
            case GRAY_SCALE:
                return new GlGrayScaleFilter();
            case INVERT:
                return new GlInvertFilter();
            case HAZE:
                return new GlHazeFilter();
            case MONOCHROME:
                return new GlMonochromeFilter();
            case BILATERAL_BLUR:
                return new GlBilateralFilter();
            case BOX_BLUR:
                return new GlBoxBlurFilter();
            case SPHERE_REFRACTION:
                return new GlSphereRefractionFilter();
            case VIGNETTE:
                return new GlVignetteFilter();
            case FILTER_GROUP_SAMPLE:
                return new GlFilterGroup(new GlSepiaFilter(), new GlVignetteFilter());
            case GAUSSIAN_FILTER:
                return new GlGaussianBlurFilter();
            case BULGE_DISTORTION:
                return new GlBulgeDistortionFilter();
            case CGA_COLORSPACE:
                return new GlCGAColorspaceFilter();
            case SHARP:
                GlSharpenFilter glSharpenFilter = new GlSharpenFilter();
                glSharpenFilter.setSharpness(4f);
                return glSharpenFilter;
            case POSTERIZE:
                return new GlPosterizeFilter();
            case TONE:
                return new GlToneFilter();
            case LuminanceThreshold:
                return new GlLuminanceThresholdFilter();
            case Pixelation:
                return new GlPixelationFilter();
            case RGBFilter:
                return new GlRGBFilter();
            case Solarize:
                return new GlSolarizeFilter();
            case Swirl:
                return new GlSwirlFilter();
            case Vibrance:
                return new GlVibranceFilter();
            case ZoomBlur:
                return new GlZoomBlurFilter();
            default:
                return new GlFilter();
        }
    }

}