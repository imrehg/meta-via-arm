# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided by VIA Embedded VAB-820/AMOS-820"
DESCRIPTION = "Linux Kernel provided by VIA Embedded for the VAB-820 boards \
and AMOS-820 system."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "via_3.10.17_2.0.7"
LOCALVERSION = "-2.0.7"
SRCREV = "958769da5323dc2160019a691237d37c31fdc65d"

SRC_URI = "git://github.com/viaembedded/vab820-kernel-bsp.git;protocol=http;branch=${SRCBRANCH} \
	   file://defconfig;md5=44b578effe92ee545c00147cbe0fa267 \
"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(vab820)"
