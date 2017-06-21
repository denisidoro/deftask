(ns tasclj.tasker)

(ns tasclj.tasker)

(defn alarmVol
  [level display sound
  (js/alarmVol level display sound))

(defn audioRecord
  [destPath source codec format]
  (js/audioRecord destPath source codec format))

(defn audioRecordStop 
  []
  (js/audioRecordStop ))

(defn browseURL 
  [URL]
  (js/browseURL URL))

(defn button 
  [name]
  (js/button name))

(defn call 
  [num autoDial]
  (js/call num autoDial))

(defn callBlock 
  [numMatch showInfo]
  (js/callBlock numMatch showInfo))

(defn callDivert 
  [fromMatch to showInfo]
  (js/callDivert fromMatch to showInfo))

(defn callRevert 
  [numMatch]
  (js/callRevert numMatch))

(defn carMode 
  [onFlag]
  (js/carMode onFlag))

(defn clearKey 
  [keyName]
  (js/clearKey keyName))

(defn composeEmail 
  [to subject message]
  (js/composeEmail to subject message))

(defn composeMMS 
  [to subject message attachmentPath]
  (js/composeMMS to subject message attachmentPath))

(defn composeSMS 
  [to message]
  (js/composeSMS to message))

(defn convert 
  [val conversionType]
  (js/convert val conversionType))

(defn createDir 
  [dirPath createParent useRoot]
  (js/createDir dirPath createParent useRoot))

(defn createScene 
  [sceneName]
  (js/createScene sceneName))

(defn cropImage 
  [fromLeftPercent fromRightPercent fromTopPercent fromBottomPercent]
  (js/cropImage fromLeftPercent fromRightPercent fromTopPercent fromBottomPercent))

(defn decryptDir 
  [path key removeKey]
  (js/decryptDir path key removeKey))

(defn decryptFile 
  [path key removeKey]
  (js/decryptFile path key removeKey))

(defn deleteDir 
  [dirPath recurse useRoot]
  (js/deleteDir dirPath recurse useRoot))

(defn deleteFile 
  [filePath shredTimes useRoot]
  (js/deleteFile filePath shredTimes useRoot))

(defn destroyScene 
  [sceneName]
  (js/destroyScene sceneName))

(defn displayAutoBright 
  [onFlag]
  (js/displayAutoBright onFlag))

(defn displayRotate 
  [onFlag]
  (js/displayRotate onFlag))

(defn displayTimeout 
  [hours minutes seconds]
  (js/displayTimeout hours minutes seconds))

(defn dpad 
  [direction noRepeats]
  (js/dpad direction noRepeats))

(defn enableProfile 
  [name enable]
  (js/enableProfile name enable))

(defn encryptDir 
  [path keyName rememberKey shredOriginal]
  (js/encryptDir path keyName rememberKey shredOriginal))

(defn elemBackColour 
  [scene element startColour endColour]
  (js/elemBackColour scene element startColour endColour))

(defn elemBorder 
  [scene element width colour]
  (js/elemBorder scene element width colour))

(defn elemPosition 
  [scene element orientation x y animMS]
  (js/elemPosition scene element orientation x y animMS))

(defn elemText 
  [scene element position text]
  (js/elemText scene element position text))

(defn elemTextColour 
  [scene element colour]
  (js/elemTextColour scene element colour))

(defn elemTextSize 
  [scene element size]
  (js/elemTextSize scene element size))

(defn elemVisibility 
  [scene element visible animationTimeMS]
  (js/elemVisibility scene element visible animationTimeMS))

(defn endCall 
  []
  (js/endCall ))

(defn encryptFile 
  [path keyName rememberKey shredOriginal]
  (js/encryptFile path keyName rememberKey shredOriginal))

(defn enterKey 
  [title keyName showOverKeyguard confirm background layout bool = str int]
  (js/enterKey title keyName showOverKeyguard confirm background layout bool = str int))

(defn flipImage 
  [horizontal]
  (js/flipImage horizontal))

(defn exit 
  []
  (js/exit ))

(defn flash 
  [message]
  (js/flash message))

(defn flashLong 
  [message]
  (js/flashLong message))

(defn getLocation 
  [source keepTracking timeoutSecs]
  (js/getLocation source keepTracking timeoutSecs))

(defn getVoice 
  [prompt languageModel timeout]
  (js/getVoice prompt languageModel timeout))

(defn goHome 
  [screenNum]
  (js/goHome screenNum))

(defn haptics 
  [onFlag]
  (js/haptics onFlag))

(defn hideScene 
  [sceneName]
  (js/hideScene sceneName))

(defn global 
  [varName]
  (js/global varName))

(defn listFiles 
  [dirPath hiddenToo]
  (js/listFiles dirPath hiddenToo))

(defn loadApp 
  [name data excludeFromRecents]
  (js/loadApp name data excludeFromRecents))

(defn loadImage 
  [uri]
  (js/loadImage uri))

(defn lock 
  [title code allowCancel rememberCode fullScreen background layout]
  (js/lock title code allowCancel rememberCode fullScreen background layout))

(defn mediaControl 
  [action]
  (js/mediaControl action))

(defn micMute 
  [shouldMute]
  (js/micMute shouldMute))

(defn mobileData 
  [set]
  (js/mobileData set))

(defn musicBack 
  [seconds]
  (js/musicBack seconds))

(defn musicPlay 
  [path offsetSecs loop stream]
  (js/musicPlay path offsetSecs loop stream))

(defn musicSkip 
  [seconds]
  (js/musicSkip seconds))

(defn musicStop 
  []
  (js/musicStop ))

(defn nightMode 
  [onFlag]
  (js/nightMode onFlag))

(defn popup 
  [title text showOverKeyguard background layout timeoutSecs]
  (js/popup title text showOverKeyguard background layout timeoutSecs))

(defn performTask 
  [taskName priority parameterOne parameterTwo]
  (js/performTask taskName priority parameterOne parameterTwo))

(defn profileActive 
  [profileName]
  (js/profileActive profileName))

(defn pulse 
  [onFlag]
  (js/pulse onFlag))

(defn readFile 
  [path]
  (js/readFile path))

(defn reboot 
  [type]
  (js/reboot type))

(defn resizeImage 
  [width height]
  (js/resizeImage width height))

(defn rotateImage 
  [dir degrees]
  (js/rotateImage dir degrees))

(defn saveImage 
  [path qualityPercent deleteFromMemoryAfter]
  (js/saveImage path qualityPercent deleteFromMemoryAfter))

(defn say 
  [text engine voice stream pitch speed]
  (js/say text engine voice stream pitch speed))

(defn sendIntent 
  [action targetComp package class category data mimeType extras]
  (js/sendIntent action targetComp package class category data mimeType extras))

(defn sendSMS 
  [number text storeInMessagingApp]
  (js/sendSMS number text storeInMessagingApp))

(defn setAirplaneMode 
  [setOn]
  (js/setAirplaneMode setOn))

(defn setAirplaneRadios 
  [disableRadios]
  (js/setAirplaneRadios disableRadios))

(defn setAlarm 
  [hour min message confirmFlag]
  (js/setAlarm hour min message confirmFlag))

(defn setAutoSync 
  [setOn]
  (js/setAutoSync setOn))

(defn scanCard 
  [path]
  (js/scanCard path))

(defn setBT 
  [setOn]
  (js/setBT setOn))

(defn setBTID 
  [toSet]
  (js/setBTID toSet))

(defn setGlobal 
  [varName newValue]
  (js/setGlobal varName newValue))

(defn setKey 
  [keyName passphrase]
  (js/setKey keyName passphrase))

(defn setLocal 
  [varName newValue]
  (js/setLocal varName newValue))

(defn setClip 
  [text appendFlag]
  (js/setClip text appendFlag))

(defn settings 
  [screenName]
  (js/settings screenName))

(defn setWallpaper 
  [path]
  (js/setWallpaper path))

(defn setWifi 
  [setOn]
  (js/setWifi setOn))

(defn shell 
  [command asRoot timoutSecs]
  (js/shell command asRoot timoutSecs))

(defn showScene 
  [name displayAs hoffset voffset showExitIcon waitForExit]
  (js/showScene name displayAs hoffset voffset showExitIcon waitForExit))

(defn shutdown 
  []
  (js/shutdown ))

(defn silentMode 
  [mode]
  (js/silentMode mode))

(defn sl4a 
  [scriptName inTerminal]
  (js/sl4a scriptName inTerminal))

(defn soundEffects 
  [setTo]
  (js/soundEffects setTo))

(defn speakerPhone 
  [setFlag]
  (js/speakerPhone setFlag))

(defn statusBar 
  [expanded]
  (js/statusBar expanded))

(defn stayOn 
  [mode]
  (js/stayOn mode))

(defn stopLocation 
  []
  (js/stopLocation ))

(defn stopTask 
  [err]
  (js/stopTask err))

(defn systemLock 
  []
  (js/systemLock ))

(defn taskRunning 
  [taskName]
  (js/taskRunning taskName))

(defn takeCall 
  []
  (js/takeCall ))

(defn takePhoto 
  [camera fileName resolution insertGallery]
  (js/takePhoto camera fileName resolution insertGallery))

(defn type 
  [text repeatCount]
  (js/type text repeatCount))

(defn unzip 
  [zipPath deleteZipAfter]
  (js/unzip zipPath deleteZipAfter))

(defn usbTether 
  [set]
  (js/usbTether set))

(defn vibrate 
  [durationMilliseconds]
  (js/vibrate durationMilliseconds))

(defn vibratePattern 
  [pattern]
  (js/vibratePattern pattern))

(defn wait 
  [durationMilliseconds]
  (js/wait durationMilliseconds))

(defn wifiTether 
  [set]
  (js/wifiTether set))

(defn writeFile 
  [path text append]
  (js/writeFile path text append))

(defn zip 
  [path level deleteOriginalAfter]
  (js/zip path level deleteOriginalAfter))
