package Database;

class MaxMovePower {
    public static int powerCalc(Move move) {
        int power = 0;
        switch (move.name) {
            case "Struggle":
                power=1;
                break;
            case "Poison Sting":
            case "Acid":
            case "Smog":
            case "Mach Punch":
            case "Rock Smash":
            case "Arm Thrust":
            case "Vacuum Wave":
            case "Acid Spray":
            case "Power-Up Punch":
                power = 70;
                break;
            // Power 75
            case "Counter":
            case "Seismic Toss":
            case "Poison Fang":
            case "Poison Tail":
            case "Clear Smog":
                power = 75;
                break;

            // Power 80
            case "Double Kick":
            case "Triple Kick":
            case "Revenge":
            case "Force Palm":
            case "Storm Throw":
            case "Circle Throw":
                power = 80;
                break;

            case "Sludge":
            case "Vital Throw":
            case "Cross Poison":
            case "Venoshock":
            case "Low Sweep":
                power = 85;
                break;

            case "Body Press":
            case "Pound":
            case "Pay Day":
            case "Scratch":
            case "Gust":
            case "Bind":
            case "Fury Attack":
            case "Tackle":
            case "Wrap":
            case "Ember":
            case "Water Gun":
            case "Peck":
            case "Submission":
            case "Absorb":
            case "Mega Drain":
            case "Fire Spin":
            case "Thunder Shock":
            case "Quick Attack":
            case "Lick":
            case "Powder Snow":
            case "Sludge Bomb":
            case "Mud-Slap":
            case "Rollout":
            case "False Swipe":
            case "Fury Cutter":
            case "Dynamic Punch":
            case "Cross Chop":
            case "Twister":
            case "Whirlpool":
            case "Fake Out":
            case "Brick Break":
            case "Astonish":
            case "Sand Tomb":
            case "Hammer Arm":
            case "Feint":
            case "Aura Sphere":
            case "Poison Jab":
            case "Drain Punch":
            case "Bullet Punch":
            case "Ice Shard":
            case "Shadow Sneak":
            case "Aqua Jet":
            case "Sludge Wave":
            case "Echoed Voice":
            case "Sacred Sword":
            case "Secret Sword":
            case "Flying Press":
                power = 85;
                break;

            // Power 90
            case "Disarming Voice":
            case "Fairy Wind":
            case "Water Shuriken":
            case "Nuzzle":
            case "Hold Back":
            case "Infestation":
            case "Leafage":
            case "Accelerock":
            case "Snap Trap":
            case "Branch Poke":
            case "Shell Side Arm":
            case "Thunderous Kick":
                power = 90;
                break;

            // Power 95
            case "Belch":
            case "Close Combat":
            case "Focus Blast":
            case "Gunk Shot":
            case "High Jump Kick":
            case "Multi-Attack":
            case "Superpower":
                power = 95;
                break;

            // Power 100
            case "Beat Up":
            case "Charge Beam":
            case "Confusion":
            case "Cut":
            case "Draining Kiss":
            case "Fell Stinger":
            case "Final Gambit":
            case "Flame Charge":
            case "Fling":
            case "Focus Punch":
            case "Fury Swipes":
            case "Low Kick":
            case "Metal Burst":
            case "Metal Claw":
            case "Meteor Assault":
            case "Mirror Coat":
            case "Nature's Madness":
            case "Night Shade":
            case "Payback":
            case "Present":
            case "Rapid Spin":
            case "Reversal":
            case "Rock Throw":
            case "Smack Down":
            case "Snore":
            case "Spit Up":
            case "Struggle Bug":
            case "Super Fang":
            case "Vine Whip":
                power = 100;
                break;

            // Power 110
            case "Acrobatics":
            case "Aerial Ace":
            case "Air Cutter":
            case "Ancient Power":
            case "Assurance":
            case "Avalanche":
            case "Bite":
            case "Breaking Swipe":
            case "Brutal Swing":
            case "Bug Bite":
            case "Bulldoze":
            case "Covet":
            case "Dragon Breath":
            case "Dragon Tail":
            case "Electroweb":
            case "Flame Wheel":
            case "Flip Turn":
            case "Frost Breath":
            case "Icy Wind":
            case "Incinerate":
            case "Magical Leaf":
            case "Mud Shot":
            case "Pluck":
            case "Razor Leaf":
            case "Rock Tomb":
            case "Round":
            case "Shadow Punch":
            case "Shock Wave":
            case "Snarl":
            case "Swift":
            case "Thief":
            case "Vise Grip":
            case "Water Pulse":
            case "Wing Attack":
                power = 110;
                break;

            // Power 120
            case "Aurora Beam":
            case "Brine":
            case "Bubble Beam":
            case "Burning Jealousy":
            case "Chatter":
            case "Double Hit":
            case "Facade":
            case "Fire Fang":
            case "Freeze-Dry":
            case "Glaciate":
            case "Grassy Glide":
            case "Headbutt":
            case "Hex":
            case "Horn Attack":
            case "Ice Fang":
            case "Knock Off":
            case "Leaf Tornado":
            case "Luster Purge":
            case "Mist Ball":
            case "Night Slash":
            case "Octazooka":
            case "Parabolic Charge":
            case "Psybeam":
            case "Psycho Cut":
            case "Retaliate":
            case "Scorching Sands":
            case "Shadow Claw":
            case "Skitter Smack":
            case "Slash":
            case "Smart Strike":
            case "Spark":
            case "Steel Wing":
            case "Stomp":
            case "Sucker Punch":
            case "Thunder Fang":
            case "Trop Kick":
            case "U-turn":
            case "Volt Switch":
                power = 120;
                break;

            case "Aeroblast":
            case "Air Slash":
            case "Anchor Shot":
            case "Apple Acid":
            case "Aqua Tail":
            case "Attack Order":
            case "Beak Blast":
            case "Behemoth Bash":
            case "Behemoth Blade":
            case "Blaze Kick":
            case "Body Slam":
            case "Bolt Beak":
            case "Bone Rush":
            case "Bonemerang":
            case "Bounce":
            case "Bug Buzz":
            case "Bullet Seed":
            case "Core Enforcer":
            case "Crabhammer":
            case "Crunch":
            case "Crush Claw":
            case "Dark Pulse":
            case "Darkest Lariat":
            case "Dazzling Gleam":
            case "Diamond Storm":
            case "Dig":
            case "Discharge":
            case "Dive":
            case "Dragon Claw":
            case "Dragon Darts":
            case "Dragon Hammer":
            case "Dragon Pulse":
            case "Dragon Rush":
            case "Dream Eater":
            case "Drill Peck":
            case "Drill Run":
            case "Drum Beating":
            case "Dual Chop":
            case "Dual Wingbeat":
            case "Earth Power":
            case "Earthquake":
            case "Eerie Spell":
            case "Electro Ball":
            case "Endeavor":
            case "Energy Ball":
            case "Expanding Force":
            case "Extrasensory":
            case "Extreme Speed":
            case "False Surrender":
            case "Fiery Dance":
            case "Fiery Wrath":
            case "Fire Lash":
            case "Fire Pledge":
            case "Fire Punch":
            case "First Impression":
            case "Fishious Rend":
            case "Fissure":
            case "Flail":
            case "Flamethrower":
            case "Flash Cannon":
            case "Fly":
            case "Foul Play":
            case "Freezing Glare":
            case "Fusion Bolt":
            case "Fusion Flare":
            case "Gear Grind":
            case "Giga Drain":
            case "Grass Knot":
            case "Grass Pledge":
            case "Grav Apple":
            case "Guillotine":
            case "Gyro Ball":
            case "Heat Crash":
            case "Heat Wave":
            case "Heavy Slam":
            case "High Horsepower":
            case "Horn Drill":
            case "Horn Leech":
            case "Hyper Fang":
            case "Hyper Voice":
            case "Hyperspace Fury":
            case "Hyperspace Hole":
            case "Ice Beam":
            case "Ice Hammer":
            case "Ice Punch":
            case "Icicle Crash":
            case "Icicle Spear":
            case "Inferno":
            case "Iron Head":
            case "Iron Tail":
            case "Jaw Lock":
            case "Judgment":
            case "Land's Wrath":
            case "Lash Out":
            case "Lava Plume":
            case "Leaf Blade":
            case "Leech Life":
            case "Liquidation":
            case "Lunge":
            case "Magma Storm":
            case "Mega Punch":
            case "Meteor Mash":
            case "Misty Explosion":
            case "Moonblast":
            case "Moongeist Beam":
            case "Muddy Water":
            case "Mystical Fire":
            case "Night Daze":
            case "Oblivion Wing":
            case "Overdrive":
            case "Petal Blizzard":
            case "Phantom Force":
            case "Photon Geyser":
            case "Pin Missile":
            case "Plasma Fists":
            case "Play Rough":
            case "Pollen Puff":
            case "Power Gem":
            case "Power Trip":
            case "Psychic":
            case "Psychic Fangs":
            case "Psyshock":
            case "Psystrike":
            case "Razor Shell":
            case "Relic Song":
            case "Revelation Dance":
            case "Rock Blast":
            case "Rock Slide":
            case "Sacred Fire":
            case "Scald":
            case "Scale Shot":
            case "Searing Shot":
            case "Seed Bomb":
            case "Shadow Ball":
            case "Shadow Bone":
            case "Sheer Cold":
            case "Slam":
            case "Snipe Shot":
            case "Spacial Rend":
            case "Sparkling Aria":
            case "Spectral Thief":
            case "Spirit Break":
            case "Spirit Shackle":
            case "Stomping Tantrum":
            case "Stone Edge":
            case "Stored Power":
            case "Strange Steam":
            case "Strength":
            case "Sunsteel Strike":
            case "Surf":
            case "Surging Strikes":
            case "Tail Slap":
            case "Take Down":
            case "Terrain Pulse":
            case "Thousand Arrows":
            case "Thousand Waves":
            case "Throat Chop":
            case "Thunder Cage":
            case "Thunder Punch":
            case "Thunderbolt":
            case "Tri Attack":
            case "Uproar":
            case "Water Pledge":
            case "Waterfall":
            case "Weather Ball":
            case "Wicked Blow":
            case "Wild Charge":
            case "X-Scissor":
            case "Zen Headbutt":
            case "Zing Zap":
                power = 130;
                break;
            case "Astral Barrage":
            case "Aura Wheel":
            case "Blizzard":
            case "Blue Flare":
            case "Bolt Strike":
            case "Boomburst":
            case "Brave Bird":
            case "Burn Up":
            case "Clanging Scales":
            case "Crush Grip":
            case "Doom Desire":
            case "Double Iron Bash":
            case "Double-Edge":
            case "Draco Meteor":
            case "Dragon Ascent":
            case "Dynamax Cannon":
            case "Fire Blast":
            case "Flare Blitz":
            case "Fleur Cannon":
            case "Freeze Shock":
            case "Future Sight":
            case "Glacial Lance":
            case "Head Charge":
            case "Hurricane":
            case "Hydro Pump":
            case "Ice Burn":
            case "Last Resort":
            case "Leaf Storm":
            case "Light of Ruin":
            case "Mega Kick":
            case "Megahorn":
            case "Meteor Beam":
            case "Origin Pulse":
            case "Outrage":
            case "Overheat":
            case "Petal Dance":
            case "Poltergeist":
            case "Power Whip":
            case "Precipice Blades":
            case "Psycho Boost":
            case "Pyro Ball":
            case "Rising Voltage":
            case "Seed Flare":
            case "Shadow Force":
            case "Skull Bash":
            case "Sky Attack":
            case "Solar Beam":
            case "Solar Blade":
            case "Steam Eruption":
            case "Steel Beam":
            case "Steel Roller":
            case "Techno Blast":
            case "Thrash":
            case "Thunder":
            case "Triple Axel":
            case "Volt Tackle":
            case "Wood Hammer":
            case "Zap Cannon":
                power = 140;
                break;
            case "Blast Burn":
            case "Dragon Energy":
            case "Eruption":
            case "Eternabeam":
            case "Explosion":
            case "Frenzy Plant":
            case "Giga Impact":
            case "Head Smash":
            case "Hydro Cannon":
            case "Hyper Beam":
            case "Mind Blown":
            case "Prismatic Laser":
            case "Roar of Time":
            case "Rock Wrecker":
            case "Self-Destruct":
            case "Shell Trap":
            case "V-create":
            case "Water Spout":
                power = 150;
                break;
            default:
                power=0;
                break;

        }

        return power;
    }
}