package tk.shanebee.hg.managers;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import tk.shanebee.hg.HG;
import tk.shanebee.hg.game.Game;
import tk.shanebee.hg.util.Util;

/**
 * General scoreboard manager
 */
public class SBDisplay {

	private ScoreboardManager manager;
	private Scoreboard board;
	private Objective ob;
	private HashMap<String, Scoreboard> score = new HashMap<>();
	private final Game game;

	public SBDisplay(Game game) {
	}

	public void setAlive() {
	}

	public void resetAlive() {
	}

	public void setSB(Player p) {
	}

	public void restoreSB(Player p) {
	}
}
