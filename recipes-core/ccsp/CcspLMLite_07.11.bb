SUMMARY = "CCSP CcspLMLite component"
HOMEPAGE = "http://github.com/ccsp-yocto/CcspLMLite"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b9c3a810ba2d91cab5522ca08f70b47"

SRC_URI = "\
git://github.com/ccsp-yocto/CcspLMLite.git;protocol=git;branch=master \
    "
SRCREV="92a716e1d82d61da7f4d61acbd3323a25d9a6741"

SRC_URI[md5sum] = "d338d61e396d5038025339bf5bdb169d"
SRC_URI[sha256sum] = "e6f5a166c0e0f775dc09261f992abb561b781f4a992ef2c0081edcf6b265df24"

S = "${WORKDIR}/git"

inherit autotools
