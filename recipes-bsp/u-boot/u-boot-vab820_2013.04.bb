# VIA VAB-820 u-boot

require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot which includes support for the VIA VAB-820 board and AMOS-820 system."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

PROVIDES += "u-boot"

PV = "2013.04"

SRCREV = "f438a80573fccb97a53e2445c7eb9e30169fa9a0"
SRCBRANCH = "via_3.10.17_2.0.1"

SRC_URI = "git://github.com/viaembedded/vab820-uboot-bsp.git;protocol=http;branch=${SRCBRANCH} \
	   file://u-boot-default-to-boot-from-the-SD-card.patch;md5=9958e93ec0cd0f3ec92d6673fdcf68c6 \
"
S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(vab820)"
