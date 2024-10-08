inherit qprebuilt pkgconfig

LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DESCRIPTION = "Camx"

DEPENDS += "syslog-plumber glib-2.0 gbm property-vault camxapi-kt fastrpc qcom-adreno"

RDEPENDS:${PN} += "cameradlkm"

SRC_URI[qcm6490.sha256sum] = "1db1f9019e8c811da53f8fe32b39865b453b50f29b3bbc6aee734108a6760489"

SRC_URI = "https://${PBT_ARTIFACTORY}/${PBT_BUILD_ID}/${PBT_BIN_PATH}/${BPN}_${PV}_${PBT_ARCH}.tar.gz;name=${PBT_ARCH}"

FILES:${PN} = "\
    /usr/lib/* \
    /usr/bin/* \
    /usr/include/* \
    /lib/firmware/*"
FILES:${PN}-dev = ""


INSANE_SKIP:${PN}-dbg = "arch"
INSANE_SKIP:${PN} = "arch"
