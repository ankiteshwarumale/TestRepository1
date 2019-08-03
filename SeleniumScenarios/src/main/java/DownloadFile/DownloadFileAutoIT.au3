#include <InetConstants.au3>
#include <MsgBoxConstants.au3>

; Download a file in the background.
; Wait for the download to complete.

Example()

Func Example()
    ; Save the downloaded file to the temporary folder.
    Local $sFilePath = "D:\SELENIUM ECLIPSE WORKSPACE\JulySelenium22\src\main\java\DownloadFile\IEDriver.zip"

    ; Download the file by waiting for it to complete. The option of 'get the file from the local cache' has been selected.
    Local $iBytesSize = InetGet($CmdLine[1], $CmdLine[2], $INET_FORCERELOAD)


EndFunc   ;==>Example
