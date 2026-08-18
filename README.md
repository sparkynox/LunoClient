<p align="center">
  <img src=".github/assets/luno_icon.jpg" width="120" height="120" alt="LunoClient icon">
</p>

<h1 align="center">LunoClient</h1>

<p align="center">A Minecraft: Java Edition launcher for Android — anime-themed, optimization-focused.</p>

## About

LunoClient is a custom Android Minecraft launcher built by **SparkyNox**, on top of the
[MojoLauncher](https://github.com/MojoLauncher/MojoLauncher) source code (itself a fork of
[PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher)).

This project would not exist without the work of the original MojoLauncher and PojavLauncher
authors and contributors. All core launching, rendering, and JRE/version-handling logic is
built on their engine. LunoClient's contribution on top of that base is:

- A clean, anime-themed UI overhaul
- First-run onboarding: splash, Terms of Service, welcome, and tutorial screens
- Additional features not present in stock MojoLauncher
- General performance/cleanup work

## Credits

- **MojoLauncher** — https://github.com/MojoLauncher/MojoLauncher
- **PojavLauncher** — https://github.com/PojavLauncherTeam/PojavLauncher (original project MojoLauncher is based on)

See [`README_MOJOLAUNCHER_ORIGINAL.md`](./README_MOJOLAUNCHER_ORIGINAL.md) for the original
upstream README, and [`LICENSE`](./LICENSE) for the LGPLv3 license this project is distributed under.

## License

LunoClient is distributed under the **GNU Lesser General Public License v3.0 (LGPLv3)**,
same as its upstream. See [`LICENSE`](./LICENSE) for the full text.

## Building

Same as upstream MojoLauncher:

```
./gradlew :app_pojavlauncher:assembleFullDebug
```

(This repo builds automatically via GitHub Actions on every push — see `.github/workflows/android.yml`.)

## Terms of Service

LunoClient shows a Terms of Service screen on first launch covering licensing, redistribution,
and hack-client usage. See `LunoTosActivity.java` for the full text shown in-app.
