(ns tascler.tasker)

; http://tasker.dinglisch.net/userguide/en/javascript.html

(defn alarm-vol
  [level display sound]
  (js/alarmVol level display sound))

(defn audio-record
  [destPath source codec format]
  (js/audioRecord destPath source codec format))

(defn audio-record-stop
  []
  (js/audioRecordStop))

(defn browse-url
  [URL]
  (js/browseURL URL))

(defn button
  [name]
  (js/button name))

(defn call
  [num autoDial]
  (js/call num autoDial))

(defn call-block
  [numMatch showInfo]
  (js/callBlock numMatch showInfo))

(defn call-divert
  [fromMatch to showInfo]
  (js/callDivert fromMatch to showInfo))

(defn call-revert
  [numMatch]
  (js/callRevert numMatch))

(defn car-mode
  [onFlag]
  (js/carMode onFlag))

(defn clear-key
  [keyName]
  (js/clearKey keyName))

(defn compose-email
  [to subject message]
  (js/composeEmail to subject message))

(defn compose-mms
  [to subject message attachmentPath]
  (js/composeMMS to subject message attachmentPath))

(defn compose-sms
  [to message]
  (js/composeSMS to message))

(defn convert
  [val conversionType]
  (js/convert val conversionType))

(defn create-dir
  [dirPath createParent useRoot]
  (js/createDir dirPath createParent useRoot))

(defn create-scene
  [sceneName]
  (js/createScene sceneName))

(defn crop-image
  [fromLeftPercent fromRightPercent fromTopPercent fromBottomPercent]
  (js/cropImage fromLeftPercent fromRightPercent fromTopPercent fromBottomPercent))

(defn decrypt-dir
  [path key removeKey]
  (js/decryptDir path key removeKey))

(defn decrypt-file
  [path key removeKey]
  (js/decryptFile path key removeKey))

(defn delete-dir
  [dirPath recurse useRoot]
  (js/deleteDir dirPath recurse useRoot))

(defn delete-file
  [filePath shredTimes useRoot]
  (js/deleteFile filePath shredTimes useRoot))

(defn destroy-scene
  [sceneName]
  (js/destroyScene sceneName))

(defn display-auto-bright
  [onFlag]
  (js/displayAutoBright onFlag))

(defn display-rotate
  [onFlag]
  (js/displayRotate onFlag))

(defn display-timeout
  [hours minutes seconds]
  (js/displayTimeout hours minutes seconds))

(defn dpad
  [direction noRepeats]
  (js/dpad direction noRepeats))

(defn enable-profile
  [name enable]
  (js/enableProfile name enable))

(defn encrypt-dir
  [path keyName rememberKey shredOriginal]
  (js/encryptDir path keyName rememberKey shredOriginal))

(defn elem-back-color
  [scene element startColour endColour]
  (js/elemBackColour scene element startColour endColour))

(defn elem-border
  [scene element width colour]
  (js/elemBorder scene element width colour))

(defn elem-position
  [scene element orientation x y animMS]
  (js/elemPosition scene element orientation x y animMS))

(defn elem-text
  [scene element position text]
  (js/elemText scene element position text))

(defn elem-text-color
  [scene element colour]
  (js/elemTextColour scene element colour))

(defn elem-text-size
  [scene element size]
  (js/elemTextSize scene element size))

(defn elem-visibility
  [scene element visible animationTimeMS]
  (js/elemVisibility scene element visible animationTimeMS))

(defn end-call
  []
  (js/endCall))

(defn encrypt-file
  [path keyName rememberKey shredOriginal]
  (js/encryptFile path keyName rememberKey shredOriginal))

(defn enter-key
  [title keyName showOverKeyguard confirm background layout timeoutSecs]
  (js/enterKey title keyName showOverKeyguard confirm background layout timeoutSecs))

(defn flip-image
  [horizontal]
  (js/flipImage horizontal))

(defn exit
  []
  (js/exit))

(defn flash
  [message]
  (js/flash message))

(defn flash-long
  [message]
  (js/flashLong message))

(defn get-location
  [source keepTracking timeoutSecs]
  (js/getLocation source keepTracking timeoutSecs))

(defn get-voice
  [prompt languageModel timeout]
  (js/getVoice prompt languageModel timeout))

(defn go-home
  [screenNum]
  (js/goHome screenNum))

(defn haptics
  [onFlag]
  (js/haptics onFlag))

(defn hide-scene
  [sceneName]
  (js/hideScene sceneName))

(defn global
  [varName]
  (js/global varName))

(defn list-files
  [dirPath hiddenToo]
  (js/listFiles dirPath hiddenToo))

(defn load-app
  [name data excludeFromRecents]
  (js/loadApp name data excludeFromRecents))

(defn load-image
  [uri]
  (js/loadImage uri))

(defn lock
  [title code allowCancel rememberCode fullScreen background layout]
  (js/lock title code allowCancel rememberCode fullScreen background layout))

(defn media-control
  [action]
  (js/mediaControl action))

(defn mic-mute
  [shouldMute]
  (js/micMute shouldMute))

(defn mobile-data
  [set]
  (js/mobileData set))

(defn music-back
  [seconds]
  (js/musicBack seconds))

(defn music-play
  [path offsetSecs loop stream]
  (js/musicPlay path offsetSecs loop stream))

(defn music-skip
  [seconds]
  (js/musicSkip seconds))

(defn music-stop
  []
  (js/musicStop ))

(defn night-mode
  [onFlag]
  (js/nightMode onFlag))

(defn popup
  [title text showOverKeyguard background layout timeoutSecs]
  (js/popup title text showOverKeyguard background layout timeoutSecs))

(defn perform-task
  [taskName priority parameterOne parameterTwo]
  (js/performTask taskName priority parameterOne parameterTwo))

(defn profile-active?
  [profileName]
  (js/profileActive profileName))

(defn pulse
  [onFlag]
  (js/pulse onFlag))

(defn read-file
  [path]
  (js/readFile path))

(defn reboot
  [type]
  (js/reboot type))

(defn resize-image
  [width height]
  (js/resizeImage width height))

(defn rotate-image
  [dir degrees]
  (js/rotateImage dir degrees))

(defn save-image
  [path qualityPercent deleteFromMemoryAfter]
  (js/saveImage path qualityPercent deleteFromMemoryAfter))

(defn say
  [text engine voice stream pitch speed]
  (js/say text engine voice stream pitch speed))

(defn send-intent
  [action targetComp package class category data mimeType extras]
  (js/sendIntent action targetComp package class category data mimeType extras))

(defn send-sms
  [number text storeInMessagingApp]
  (js/sendSMS number text storeInMessagingApp))

(defn set-airplane-mode
  [setOn]
  (js/setAirplaneMode setOn))

(defn set-airplane-radios
  [disableRadios]
  (js/setAirplaneRadios disableRadios))

(defn set-alarm
  [hour min message confirmFlag]
  (js/setAlarm hour min message confirmFlag))

(defn set-auto-sync
  [setOn]
  (js/setAutoSync setOn))

(defn scan-card
  [path]
  (js/scanCard path))

(defn set-bluetooth
  [setOn]
  (js/setBT setOn))

(defn set-bluetooth-id
  [toSet]
  (js/setBTID toSet))

(defn set-global
  [varName newValue]
  (js/setGlobal varName newValue))

(defn set-key
  [keyName passphrase]
  (js/setKey keyName passphrase))

(defn set-local
  [varName newValue]
  (js/setLocal varName newValue))

(defn set-clip
  [text appendFlag]
  (js/setClip text appendFlag))

(defn settings
  [screenName]
  (js/settings screenName))

(defn set-wallpaper
  [path]
  (js/setWallpaper path))

(defn set-wifi
  [setOn]
  (js/setWifi setOn))

(defn ^:export shell
  ([command]
    (shell command true))
  ([command asRoot]
    (shell command asRoot 300))
  ([command asRoot timoutSecs]
    (js/shell command asRoot timoutSecs)))

(defn show-scene
  [name displayAs hoffset voffset showExitIcon waitForExit]
  (js/showScene name displayAs hoffset voffset showExitIcon waitForExit))

(defn shutdown
  []
  (js/shutdown))

(defn silent-mode
  [mode]
  (js/silentMode mode))

(defn sl4a
  [scriptName inTerminal]
  (js/sl4a scriptName inTerminal))

(defn sound-effects
  [setTo]
  (js/soundEffects setTo))

(defn speaker-phone
  [setFlag]
  (js/speakerPhone setFlag))

(defn status-bar
  [expanded]
  (js/statusBar expanded))

(defn stay-on
  [mode]
  (js/stayOn mode))

(defn stop-location
  []
  (js/stopLocation ))

(defn stop-task
  [err]
  (js/stopTask err))

(defn system-lock
  []
  (js/systemLock))

(defn task-running?
  [taskName]
  (js/taskRunning taskName))

(defn take-call
  []
  (js/takeCall))

(defn take-photo
  [camera fileName resolution insertGallery]
  (js/takePhoto camera fileName resolution insertGallery))

(defn type
  [text repeatCount]
  (js/type text repeatCount))

(defn unzip
  [zipPath deleteZipAfter]
  (js/unzip zipPath deleteZipAfter))

(defn usb-tether
  [set]
  (js/usbTether set))

(defn vibrate
  [durationMilliseconds]
  (js/vibrate durationMilliseconds))

(defn vibrate-pattern
  [pattern]
  (js/vibratePattern pattern))

(defn wait
  [durationMilliseconds]
  (js/wait durationMilliseconds))

(defn wifi-tether
  [set]
  (js/wifiTether set))

(defn write-file
  [path text append]
  (js/writeFile path text append))

(defn zip
  [path level deleteOriginalAfter]
  (js/zip path level deleteOriginalAfter))
