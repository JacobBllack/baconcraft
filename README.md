# BaconCraft (Forge 47.4.0, MC 1.20.1)

Adds Bacon Ore, Raw Bacon, Bacon Ingots, tools, armor, simple worldgen, and a creative tab.

## Quickest way to get a JAR (no setup): GitHub Actions
1. Create a new GitHub repo and push this whole folder.
2. Go to **Actions** → **Build BaconCraft** (it will run automatically on push).
3. When it finishes, open the workflow run → **Artifacts** → download `baconcraft-jar`.
4. Put the JAR from `build/libs` into your `.minecraft/mods` folder for Forge 1.20.1 (47.4.0).

## Local build (2–3 minutes)
1. Install **JDK 17** (Temurin recommended).
2. Open a terminal in this folder and run:
   - Windows: `gradlew build`
   - macOS/Linux: `./gradlew build`
3. Your mod jar appears at `build/libs/`.

## Controls / Notes
- Ore spawns between Y -32 and 56.
- Smelt or blast **Raw Bacon** into **Bacon Ingots**.
- Recipes for full tool & armor set included.

If anything fails, open an issue or tell ChatGPT “build error + paste the last 50 lines of the log.”
