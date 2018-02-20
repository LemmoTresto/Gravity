package me.max.gravity.listeners;

import me.max.gravity.Gravity;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class JumpListener implements Listener {

    private Gravity gravity;

    public JumpListener(Gravity gravity){
        this.gravity = gravity;

        this.gravity.getServer().getPluginManager().registerEvents(this, gravity);
    }

    @EventHandler
    public void onJump(PlayerMoveEvent event){
        Player p = event.getPlayer();
        //if (p.isOnGround() || p.isFlying()) return; //he needs to be falling or jumping.

        //if (event.getTo().getY() < event.getFrom().getY()){
            p.setVelocity(new Vector(p.getVelocity().getX(), p.getVelocity().getY() + 0.04, p.getVelocity().getZ()));
        //}
    }
}
