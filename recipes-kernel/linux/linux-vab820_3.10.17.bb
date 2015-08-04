# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided by VIA Embedded VAB-820/AMOS-820"
DESCRIPTION = "Linux Kernel provided by VIA Embedded for the VAB-820 boards \
and AMOS-820 system."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "via_3.10.17_2.0.1"
LOCALVERSION = "-2.0.1"
SRCREV = "42e130b08bdaf03be090a47922f566adce1b2ccf"

SRC_URI = "git://github.com/viaembedded/vab820-kernel-bsp.git;protocol=http;branch=${SRCBRANCH} \
	   file://defconfig;md5=d19065fd9c094ddc4fe78d5cac4bf279 \
"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(vab820)"
