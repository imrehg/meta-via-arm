# VIA VAB-820 u-boot

require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot which includes support for the VIA VAB-820 board and AMOS-820 system."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

PROVIDES += "u-boot"

PV = "2013.04"

SRCREV = "4ddf7448ff54261c4730a8b3f06a31f20f8370f6"
SRCBRANCH = "via_3.10.17_2.0.6"

SRC_URI = "git://github.com/viaembedded/vab820-uboot-bsp.git;protocol=http;branch=${SRCBRANCH} \
"
S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(vab820)"
