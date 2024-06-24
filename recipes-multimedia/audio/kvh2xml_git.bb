inherit autotools pkgconfig

DESCRIPTION = "kvh2xml header"

LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM += "file://kvh2xml.h;beginline=2;endline=8;md5=196c6214e746e6e8bc48391c148ac7c5"

SRC_URI = "git://git.codelinaro.org/clo/le/platform/vendor/qcom-opensource/audioreach-conf.git;protocol=https;rev=8ea5b214094d709c65da006b0fbb6f7c625fc9cd;branch=audio-core.lnx.1.0.r1-rel;destsuffix=audio/opensource/audioreach-conf"

S = "${WORKDIR}/audio/opensource/audioreach-conf/acdbdata"

do_compile[noexec] = "1"

ALLOW_EMPTY:${PN} = "1"
