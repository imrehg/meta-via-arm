# Common settings for VAB-820 boards

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa9.inc

PREFERRED_PROVIDER_u-boot ?= "u-boot-vab820"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-vab820"
PREFERRED_VERSION_linux-vab820 ?= "3.10.17"

SERIAL_CONSOLE = "115200 ttymxc1"

MACHINE_FEATURES += " pci rtc"

KERNEL_IMAGETYPE = "uImage"

IMX_TEST_SUPPORT = "y"
