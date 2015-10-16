# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided by VIA Embedded VAB-820/AMOS-820"
DESCRIPTION = "Linux Kernel provided by VIA Embedded for the VAB-820 boards \
and AMOS-820 system."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "via_3.10.17_2.0.6"
LOCALVERSION = "-2.0.1"
SRCREV = "936138b99b26218558765e23b38db20a8c22c0fc"

SRC_URI = "git://github.com/viaembedded/vab820-kernel-bsp.git;protocol=http;branch=${SRCBRANCH} \
	   file://defconfig;md5=9d967720c563f4b6ed06f2d4dc94db44 \
"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(vab820)"
