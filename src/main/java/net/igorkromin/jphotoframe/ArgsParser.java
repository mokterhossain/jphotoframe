/**
 * JPhotoFrame - a simple Java application for displaying a collection of photos in a full-screen slideshow.
 * Copyright (C) 2015  Igor Kromin
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * You can find this and my other open source projects here - http://github.com/ikromin
 */

package net.igorkromin.jphotoframe;

/**
 * This class checks command line arguments and sets appropriate internal properties.
 */
public class ArgsParser {

    private static final String ARG_VAL_FIX_ROTATION = "-fixrotation";
    private static final String ARG_VAL_VERBOSE = "-verbose";

    private boolean fixRotation = false;
    private boolean verboseLog = false;
    private String configPath = null;

    public ArgsParser(String[] args) {

        for (String arg : args) {
            if (ARG_VAL_FIX_ROTATION.equals(arg)) {
                fixRotation = true;
            }
            else if (ARG_VAL_VERBOSE.equals(arg)) {
                verboseLog = true;
            }
            else {
                configPath = arg;
            }
        }

        if (fixRotation && configPath == null) {
            throw new RuntimeException("Please specify a photos directory for the rotation fix utility");
        }
    }

    public boolean fixRotation() {
        return fixRotation;
    }

    public boolean verboseLog() {
        return verboseLog;
    }

    public String configPath() {
        return configPath;
    }

}
