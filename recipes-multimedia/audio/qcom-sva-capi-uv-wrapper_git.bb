inherit qprebuilt pkgconfig

LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DESCRIPTION = "sva-xs"

DEPENDS += "qcom-sva-common qcom-sva-uv qcom-capiv2-headers qcom-sva-listen-common qcom-sva-gmm qcom-sva-swmad qcom-sva-eai-utils qcom-sva-eai"

PBT_ARCH = "armv8-2a"

SRC_URI[armv8-2a.sha256sum] = "f7452de333ad063db1d88e21bf58e99a7ab5697c7564c21936cfff873e2e9414"

SRC_URI = "https://${PBT_ARTIFACTORY}/${PBT_BUILD_ID}/${PBT_BIN_PATH}/${BPN}_${PV}_${PBT_ARCH}.tar.gz;name=${PBT_ARCH}"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""