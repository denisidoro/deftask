#!/usr/bin/env bash
# vim: filetype=sh

_catch_output() {
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
	eval "_callback() { $2; }"
	_catch_output stdout stderr _callback
else
	_catch_output stdout stderr "${@:-}"
fi

printf "%.40000s" "${?}§§§${stdout}§§§${stderr}"
