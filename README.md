# JPhotoFrame v0.1
JPhotoFrame is a simple Java application for displaying a collection of photos in a full-screen slideshow. It is meant to be used when creating a DIY photo frame.

## Features

* Lightweight and easily configurable
* Generates cached (resampled) images automatically
* Current date/time display with custom date/time formats
* Adjustable text font sizes

## Building

Use Ant to build. Edit the *jphotoframe.properties* to point to your JDK location prior to building.

``ant``

## Configuration

Configuration is simple. Add a file called *config.properties* into the same directory as the jar file. Below is a sample configuration file.

```
screenNumber=0
imageDirectory=/photos
cacheDirectory=/photos/cache
imageTimeout=300000
fontName=Verdana
fontSizeDate=20
fontSizeTime=50
dateFormat=MMM d yyyy
timeFormat=H:mm
dateOffsetX=15
dateOffsetY=10
timeOffsetX=10
timeOffsetY=30
textColor=0,0,0
textOutlineColor=255,0,0
textOutlineOffset=2
backgroundSourcePercent=0.01
backgroundOpacity=0.2
```

## Running

To run, launch the jar file like so:

`java -Xms32m -Xmx32m -jar jphotoframe.jar&`

## License

JPhotoFrame - a simple Java application for displaying a collection of photos in a full-screen slideshow.
Copyright (C) 2015  Igor Kromin

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.

You can find this and my other open source projects here - http://github.com/ikromin