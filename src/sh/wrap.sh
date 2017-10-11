#!/usr/bin/env bash
# vim: filetype=sh

catch_output() {
	eval "$({
	__2="$(
	  { __1="$("${@:3}")"; } 2>&1;
	  ret=$?;
	  printf '%q=%q\n' "$1" "$__1" >&2;
	  exit $ret
	  )"
	ret="$?";
	printf '%s=%q\n' "$2" "$__2" >&2;
	printf '( exit %q )' "$ret" >&2;
	} 2>&1)";
}

if [[ ${1:-} == "--eval" || ${1:-} == "-e" ]]; then
	eval "callback() { $2; }"
	catch_output stdout stderr callback
else
	catch_output stdout stderr "${@:-}"
fi

echo "${?}§§§${stdout}§§§${stderr}"
